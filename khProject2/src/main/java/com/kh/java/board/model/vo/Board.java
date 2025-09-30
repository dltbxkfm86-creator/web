package com.kh.java.board.model.vo;

import java.sql.Date;

public class Board {

	private Long boardNo;
	private int boardType;
	private String category;
	private String bpardTitle;
	private String boardContent;
	private String boardWriter;
	private int count;
	private Date createDate;
	private String status;
	
	public Board() {
		super();
	}

	public Board(Long boardNo, int boardType, String category, String bpardTitle, String boardContent,
			String boardWriter, int count, Date createDate, String status) {
		super();
		this.boardNo = boardNo;
		this.boardType = boardType;
		this.category = category;
		this.bpardTitle = bpardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.count = count;
		this.createDate = createDate;
		this.status = status;
	}

	public Long getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Long boardNo) {
		this.boardNo = boardNo;
	}

	public int getBoardType() {
		return boardType;
	}

	public void setBoardType(int boardType) {
		this.boardType = boardType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBpardTitle() {
		return bpardTitle;
	}

	public void setBpardTitle(String bpardTitle) {
		this.bpardTitle = bpardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardType=" + boardType + ", category=" + category + ", bpardTitle="
				+ bpardTitle + ", boardContent=" + boardContent + ", boardWriter=" + boardWriter + ", count=" + count
				+ ", createDate=" + createDate + ", status=" + status + "]";
	}
	
}
