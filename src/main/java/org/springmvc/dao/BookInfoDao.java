package org.springmvc.dao;


import org.springmvc.model.BookInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface BookInfoDao {


  BookInfo getBookDetailsByUsername(String username);

  int save(BookInfo bookInfo);

  int update(BookInfo bookInfo);
}
