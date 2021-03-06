package com.kh.john.admin.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.john.admin.model.dao.AdminDao;
import com.kh.john.admin.model.vo.AdminChat;
import com.kh.john.admin.model.vo.AdminMessage;
import com.kh.john.admin.model.vo.Notice;
import com.kh.john.admin.model.vo.NoticeFile;
import com.kh.john.board.model.vo.Board;
import com.kh.john.exboard.model.vo.ExpertRequest;
import com.kh.john.member.model.vo.License;
import com.kh.john.member.model.vo.Member;

@Service
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	private AdminDao dao;
	
	@Autowired
	private SqlSessionTemplate session;

	
	//멤버관련
	@Override
	public List<Member> selectMemberList(int cPage, int numPerPage) {
		return dao.selectMemberList(session, cPage, numPerPage);
	}

	@Override
	public int selectMemberCount() {
		
		return dao.selectMemberCount(session);
		
	}
	
	@Override
	public int deleteMember(Member m) {
		return dao.deleteMember(session, m);
	}
	
	@Override
	public List<Member> searchMemberList(Map<String,Object> param, int cPage, int numPerPage) {
		return dao.searchMemberList(session, param, cPage, numPerPage);
	}

	@Override
	public int searchMemberListCount(Map<String,Object> param) {
		return dao.searchMemberListCount(session, param);
	}

	
	
	@Override
	public Member selectMemberById(Member member) {
		return dao.selectMemberById(session, member);
	}

	//게시판관련
	@Override
	public List<Board> selectBoardList(int cPage, int numPerPage) {
		return dao.selectBoardList(session,cPage,numPerPage);
	}

	@Override
	public int selectBoardCount() {
		return dao.selectBoardCount(session);
	}
	
	@Override
	public List<Board> searchBoardList(Map<String, Object> param, int cPage, int numPerPage) {
		return dao.searchBoardList(session, param, cPage, numPerPage);
	}

	@Override
	public int searchBoardListCount(Map<String, Object> param) {
		return dao.searchBoardListCount(session, param);
	}
	
	

	//전문가관련
	@Override
	public List<Member> selectExpertList(int cPage, int numPerPage) {
		return dao.selectExpertList(session,cPage,numPerPage);
	}

	@Override
	public int selectExpertCount() {
		return dao.selectExpertCount(session);
	}

	@Override
	public List<Member> selectBeforeExpertList(int cPage, int numPerPage) {
		return dao.selectBeforeExpertList(session,cPage,numPerPage);

	}
	
	@Override
	public int selectBeforeExpertCount() {
		return dao.selectBeforeExpertCount(session);

	}

	@Override
	public Member updateMemberToExpert(Map param) {
		return dao.updateMemberToExpert(session, param);
	}
	
	

	@Override
	public List<License> updateMemberToExpertLicense(Map param) {
		return dao.updateMemberToExpertLicense(session, param);
	}

	@Override
	public List<Member> searchExpertList(Map<String, Object> param, int cPage, int numPerPage) {
		return dao.searchExpertList(session, param,cPage,numPerPage);
	}

	@Override
	public int searchExpertListCount(Map<String, Object> param) {
		return dao.searchExpertListCount(session, param);
	}
	
	@Override
	public int updateMemberToExpertEnd(Member m) {
		return dao.updateMemberToExpertEnd(session, m);
	}
	
	@Override
	public List<ExpertRequest> selectAdminExpertCounsel0(int cPage, int numPerPage) {
		System.out.println("서비스 numperpage"+numPerPage);

		return dao.selectAdminExpertCounsel0(session, cPage, numPerPage);
	}
	
	@Override
	public List<ExpertRequest> selectAdminExpertCounsel1(int cPage, int numPerPage) {
		return dao.selectAdminExpertCounsel1(session, cPage, numPerPage);
	}

	@Override
	public int selectAdminExpertCounselCount0() {
		return dao.selectAdminExpertCounselCount0(session);
	}
	
	@Override
	public int selectAdminExpertCounselCount1() {
		return dao.selectAdminExpertCounselCount1(session);
	}

	//공지관련
	@Override
	public List<Notice> selectNoticeList(int cPage, int numPerPage) {
		return dao.selectNoticeList(session,cPage,numPerPage);
	}

	@Override
	public int selectNoticeCount() {
		return dao.selectNoticeCount(session);
	}

//	@Override
//	public int insertNotice(Notice n,List<NoticeFile> files) throws RuntimeException{
//		int result = dao.insertNotice(session,n);
//		System.out.println("서비스"+files);
//		if(result>0) {
////			if(!files.isEmpty()) {
//				for(NoticeFile f:files) {
//					dao.insertNoticeFile(session, f);
//					
//				}
//			//}
//		}
//		
//		return result;
//	}
	@Override
	public int insertNotice(Notice n) {
		return dao.insertNotice(session, n);
	}
	

	@Override
	public Notice selectOneNotice(int notice_id) {
		return dao.selectOneNotice(session, notice_id);
	}


	@Override
	public List<NoticeFile> selectNoticeFile(int notice_id) {
		return dao.selectNoticeFile(session, notice_id);
	}

	@Override
	public Notice noticeModify(Map param) {
		return dao.noticeModify(session, param);
	}

	@Override
	public int noticeModifyEnd(Notice n,List<NoticeFile> files) throws RuntimeException {
		int result = dao.noticeModifyEnd(session,n);
		System.out.println("서비스"+files);
		if(result>0) {
//			if(!files.isEmpty()) {
				for(NoticeFile f:files) {
					dao.noticeModifyFile(session, f);
					
				}
			//}
		}
		
		return result;
	}

	@Override
	public int deleteNotice(Notice n) {
		int result = dao.deleteNotice(session,n);
		return result;
	}

	
	//1:1 문의관련
	
	@Override
	public int insertAdminChat(AdminChat ac) throws Exception {
		return dao.insertAdminChat(session, ac);
	}

	@Override
	public List<AdminChat> selectAdminChat(Map<String, Object> param,int cPage, int numPerPage) {
		return dao.selectAdminChat(session, param, cPage, numPerPage);
	}

	@Override
	public int selectAdminChatCount() {
		return dao.selectAdminChatCount(session);
	}

	@Override
	public List<AdminChat> selectAdminInChat() {
		return dao.selectAdminInChat(session);
	}

	@Override
	public List<Integer> firstUsidList() {
		return dao.firstUsidList(session);
	}

	@Override
	public List<Integer> secondUsidList() {
		return dao.secondUsidList(session);
	}

	@Override
	public AdminMessage loadAdminMessage(HashMap<String, Integer> usidMap) {
		return dao.loadAdminMessage(session,usidMap);
	}


	
	

	
	
	
	
	
}
