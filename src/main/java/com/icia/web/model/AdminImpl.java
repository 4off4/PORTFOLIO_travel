package com.icia.web.model;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.icia.web.dao.AdminDao;

@Repository
public class AdminImpl implements AdminDao{
   
   @Inject
   SqlSession sqlSession;
   
   //회원목록
   @Override
   public List<Admin> adminList(){
      return sqlSession.selectList("adminDao.adminList");
   }
   
   @Override
   public void insertAdmin(Admin admin) {
      
   }
   
   //회원 강제탈퇴
   @Override
   public void adminDelete(Admin admin){
      sqlSession.delete("admin.adminDelete", admin);
   }


   @Override
   public Admin adminSelect(String adminId) {
   // TODO Auto-generated method stub
   return null;
   }

@Override
public List<Admin> testList(Admin admin) {
   // TODO Auto-generated method stub
   return null;
}

@Override
public List<Admin> qList(Admin admin) {
   // TODO Auto-generated method stub
   return null;
}

@Override
public Admin testSelect(long hiBbsSeq) {
   // TODO Auto-generated method stub
   return null;
}

@Override
public Admin adminView(long hiBbsSeq) {
   // TODO Auto-generated method stub
   return null;
}

@Override
public int adminListDelete(long hiBbsSeq) {
   // TODO Auto-generated method stub
   return 0;
}

@Override
public List<Admin> testReplyList(Admin admin) {
   // TODO Auto-generated method stub
   return null;
}

@Override
public Admin qSelect(long qnaHiBbsSeq) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int adminqListDelete(long qnaHiBbsSeq) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int adminReplyInsert(Admin admin) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int adminReplyDelete(Admin admin) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Admin userSelect(String userId2) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int userDelete(String userId2) {
	// TODO Auto-generated method stub
	return 0;
}


    
}