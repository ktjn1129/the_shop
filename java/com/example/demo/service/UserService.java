package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;

/**
 * ユーザーServiceクラス
 * 
 * @author koto
 */
@Service
public class UserService {
	
	/**
	 * ユーザーDaoの紐付け
	 */
	@Autowired
	@Qualifier("UserDaoJdbc")
	UserDao dao;
	
	/**
	 * ユーザーID検索メソッド
	 * 
	 * @param id ユーザーID
	 * @return dao.findById(id) ユーザー情報
	 */
	public User findById(int id) {
		
		return dao.findById(id);
	}
	
	/**
	 * Email検索メソッド
	 * 
	 * @param email Email
	 * @return dao.findByEmail(email)　ユーザー情報
	 */
	public User findByEmail(String email) {
		
		return dao.findByEmail(email);
	}
	
	/**
	 * ユーザー名検索メソッド
	 * 
	 * @param username ユーザー名
	 * @return dao.findByEmail(email)　ユーザー情報
	 */
	public User findByUsername(String username) {
		
		return dao.findByUsername(username);
	}
	
	/**
	 * ユーザー登録メソッド
	 * 
	 * @param user ユーザー情報
	 * @return dao.regist(user) ユーザー情報
	 */
	@Transactional
	public Integer regist(User user) {
		
		return dao.regist(user);
	}
	
	/**
	 * ユーザー情報更新メソッド
	 * 
	 * @param user ユーザー情報
	 * @return dao.update(user) ユーザー情報
	 */
	@Transactional
	public User update(User user) {
		
		return dao.update(user);
	}
}
