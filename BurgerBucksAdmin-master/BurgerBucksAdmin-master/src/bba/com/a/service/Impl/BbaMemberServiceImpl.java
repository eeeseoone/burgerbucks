package bba.com.a.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bba.com.a.dao.BbaMemberDao;
import bba.com.a.model.Bb_AdminDto;
import bba.com.a.model.Bb_MemberDto;
import bba.com.a.model.Bb_StoreDto;
import bba.com.a.service.BbaMemberSerivce;

@Service
public class BbaMemberServiceImpl implements BbaMemberSerivce {

	@Autowired
	private BbaMemberDao bbaMemberDao;
	
	
	
	/*------------------------------------------------------------------------------
	* 사원 로그인
	* -----------------------------------------------------------------------------*/
	@Override
	public Bb_AdminDto loginAdminIdPw(Bb_AdminDto adminDto) {
		return bbaMemberDao.loginAdminIdPw(adminDto);
	}

	/*------------------------------------------------------------------------------
	* 사원등록(브랜치매니저)
	* -----------------------------------------------------------------------------*/
	@Override
	public boolean addAdmin(Bb_AdminDto adminDto) throws Exception {
		return bbaMemberDao.addAdmin(adminDto);
	}

	/*------------------------------------------------------------------------------
	* 사원리스트 불러오기(브랜치매니저)
	* -----------------------------------------------------------------------------*/
	@Override
	public List<Bb_AdminDto> getAdminList() throws Exception {
		return bbaMemberDao.getAdminList();
	}
	
	/*------------------------------------------------------------------------------
	* 사원 id 중복체크 (브랜치매니저)
	* -----------------------------------------------------------------------------*/
	@Override
	public int getAdminID(Bb_AdminDto adminDto) {
		return bbaMemberDao.getAdminID(adminDto);
	}

	/*------------------------------------------------------------------------------
	* 사원 삭제
	* -----------------------------------------------------------------------------*/
	@Override
	public void delAdmin(int seq) {
		bbaMemberDao.delAdmin(seq);
	}
	
	
	/*------------------------------------------------------------------------------
	* 사원 회복
	* -----------------------------------------------------------------------------*/
	@Override
	public void recoveryAdmin(int seq) {
		bbaMemberDao.recoveryAdmin(seq);
		
	}
	
	
	/*------------------------------------------------------------------------------
	* 사원 수정 디테일
	* -----------------------------------------------------------------------------*/
	@Override
	public Bb_AdminDto updateAdmin(int seq) {
		// TODO Auto-generated method stub
		return bbaMemberDao.updateAdmin(seq);
	}
	
	/*------------------------------------------------------------------------------
	* 사원 수정 버튼 클릭 후
	* -----------------------------------------------------------------------------*/
	@Override
	public void updateAdminAf(Bb_AdminDto adminDto) {
		bbaMemberDao.updateAdminAf(adminDto);
		
	}

	/*------------------------------------------------------------------------------
	* 해당 시퀀스의 점포 DTO 가져오기
	* -----------------------------------------------------------------------------*/
	@Override
	public Bb_StoreDto getStoreName(int seq) {
		return bbaMemberDao.getStoreName(seq);
	}

	
	
	
	/*------------------------------------------------------------------------------
	* 고객 리스트 가져오기
	* -----------------------------------------------------------------------------*/
	@Override
	public List<Bb_MemberDto> getCustomerList() throws Exception {
		return bbaMemberDao.getCustomerList();
	}

	
	/*------------------------------------------------------------------------------
	* 고객 정보 삭제
	* -----------------------------------------------------------------------------*/
	@Override
	public void delCustomer(int seq) {
		bbaMemberDao.delCustomer(seq);
		
	}

	/*------------------------------------------------------------------------------
	* 고객 정보 상세보기 (수정)
	* -----------------------------------------------------------------------------*/
	@Override
	public Bb_MemberDto updateCustomer(int seq) {
		// TODO Auto-generated method stub
		return bbaMemberDao.updateCustomer(seq);
	}

	/*------------------------------------------------------------------------------
	* 고객 정보 수정 후
	* -----------------------------------------------------------------------------*/
	@Override
	public void updateCustomerAf(Bb_MemberDto customerDto) {
		bbaMemberDao.updateCustomerAf(customerDto);
	}

	
	
	
	
	
	
	
	
}
