package org.springmvc.service;

import org.springmvc.model.BookInfo;

public interface BookInfoService {


  BookInfo getBookDetailsByUsername(String username);

  int save(BookInfo bookInfo);

  int update(BookInfo bookInfo);
}
