package com.won15367.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.won15367.board.dao.BoardDao;

public class BWriteCommand {
	
	public void excute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BoardDao dao = new BoardDao();
		dao.write(bname, btitle, bcontent);
		
	}

}
