package com.kh.java.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.java.board.model.vo.Board;
import com.kh.java.common.vo.PageInfo;
import com.kh.java.board.model.vo.Category;

public class BoardDao {

	public int selectListCount(SqlSession sqlSession) {
		return sqlSession.selectOne("boardMapper.selectListCount");
	}

	public List<Board> selectBoardList(SqlSession sqlSession, PageInfo pi) {
		return sqlSession.selectList("boardMapper.selectBoardList", pi);
	}

	public List<com.kh.java.board.model.vo.Category> selectCategory(SqlSession sqlSession) {
		return sqlSession.selectList("boardMapper.selectCategory");
	}

	public int insertBoard(SqlSession sqlSession, Board board) {
		return sqlSession.insert("boardMapper.insertBoard", board);
	}


}
