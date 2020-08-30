package org.springmvc.dao;


import org.springmvc.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class BookInfoDaoImpl implements BookInfoDao {

    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int save(BookInfo bookInfo) {
        String sql = "insert into user_book_info values(?,?,?)";
        return jdbcTemplate.update(sql, bookInfo.getUsername(), bookInfo.getBookName(), bookInfo.getBookDescription());
    }

    public int update(BookInfo bookInfo) {
        String sql = "update user_book_info set bookName = ?, bookDescription = ? where username = ?";
        return jdbcTemplate.update(sql, bookInfo.getBookName(), bookInfo.getBookDescription(), bookInfo.getUsername());
    }


    public BookInfo getBookDetailsByUsername(String username) {
        String sql = "select * from user_book_info where username='" + username + "'";
        List<BookInfo> bookInfo = jdbcTemplate.query(sql, new UserBookInfoMapper());
        return (!bookInfo.isEmpty()) ? bookInfo.get(0) : null;
    }

    class UserBookInfoMapper implements RowMapper<BookInfo> {
        public BookInfo mapRow(ResultSet rs, int arg1) throws SQLException {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setUsername(rs.getString("username"));
            bookInfo.setBookName(rs.getString("bookName"));
            bookInfo.setBookDescription(rs.getString("bookDescription"));
            return bookInfo;
        }

    }
}

