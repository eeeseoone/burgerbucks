package bb.com.a.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import bb.com.a.model.BB_DiyBurgerDto;
import bb.com.a.model.Bb_BbsDto;
import bb.com.a.model.Bb_LikeDto;

public interface BbBurgerDiyService {
	
	/*--------------------------------------------------------------------------------------------
	 * 버거게시판리스트 가져오기
	 *-------------------------------------------------------------------------------------------*/
	public List<Bb_BbsDto> getBurgerDiyList(int seq);
	
	/*--------------------------------------------------------------------------------------------
	 * 버거디테일 가져오기
	 *-------------------------------------------------------------------------------------------*/

	public BB_DiyBurgerDto getBurgerDiyDetail(int seq);
	
	/*--------------------------------------------------------------------------------------------
	 * 내버거리스트가져오기
	 *-------------------------------------------------------------------------------------------*/
	public List<BB_DiyBurgerDto> myDiyBurgerList(int seq);
	
  /*----------------------------------------------------------------------------
   * 내버거게시판에등록
   * ----------------------------------------------------------------------------*/ 
	public void regiDiyBurger(Bb_BbsDto bsdto);

  /*----------------------------------------------------------------------------
   * 버거 라이크 추가 
   * ----------------------------------------------------------------------------*/ 
	public void likeClick(Bb_LikeDto ldto) throws Exception ;

  /*----------------------------------------------------------------------------
   * 버거 라이크 삭제 
   * ----------------------------------------------------------------------------*/ 
	public void unlikeClick(Bb_LikeDto ldto) throws Exception ;
	
 /*----------------------------------------------------------------------------
   * bbs에 버거 라이크 추가  
   * ----------------------------------------------------------------------------*/ 
	public void bbsLikeAdd(Bb_LikeDto ldto) throws Exception;

 /*----------------------------------------------------------------------------
   * bbs에 버거 라이크 추가  
   * ----------------------------------------------------------------------------*/ 
	public void bbsLikeDelete(Bb_LikeDto ldto) throws Exception;	
}