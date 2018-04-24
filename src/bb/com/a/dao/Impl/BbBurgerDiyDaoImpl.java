package bb.com.a.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bb.com.a.dao.BbBurgerDiyDao;
import bb.com.a.model.BB_DiyBurgerDto;
import bb.com.a.model.Bb_BbsDto;
import bb.com.a.model.Bb_LikeDto;


@Repository
public class BbBurgerDiyDaoImpl implements BbBurgerDiyDao {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	String ns="BBBurgerDiy.";
	//
	/*--------------------------------------------------------------------------------------------
	 * 버거게시판리스트 가져오기
	 *-------------------------------------------------------------------------------------------*/
	@Override
	public List<Bb_BbsDto> getBurgerDiyList(int seq) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getBurgerDiyList", seq);
	}
	/*--------------------------------------------------------------------------------------------
	 * 버거디테일 가져오기
	 *-------------------------------------------------------------------------------------------*/

	@Override
	public BB_DiyBurgerDto getBurgerDiyDetail(int seq) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"getBurgerDiyDetail", seq);
	}
	/*--------------------------------------------------------------------------------------------
	 * 내버거리스트가져오기
	 *-------------------------------------------------------------------------------------------*/
	@Override
	public List<BB_DiyBurgerDto> myDiyBurgerList(int seq) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"myDiyBurgerList", seq);
	}

  /*----------------------------------------------------------------------------
   * 내버거게시판에등록
   * ----------------------------------------------------------------------------*/ 
	@Override
	public void regiDiyBurger(Bb_BbsDto bsdto) {
		int count =sqlSession.insert(ns+"regiDiyBurger", bsdto);
		
	}
	
  /*----------------------------------------------------------------------------
   * 버거 라이크
   * ----------------------------------------------------------------------------*/ 

	@Override
	public void likeClick(Bb_LikeDto ldto) throws Exception {
		sqlSession.insert(ns+"likeAdd", ldto);
	}

	@Override
	public void unlikeClick(Bb_LikeDto ldto) throws Exception {
		sqlSession.insert(ns+"likeDelete", ldto);
	}

	@Override
	public void bbsLikeAdd(Bb_LikeDto ldto) throws Exception {
		sqlSession.update(ns+"bbsLikeAdd", ldto);
	}

	@Override
	public void bbsLikeDelete(Bb_LikeDto ldto) throws Exception {
		sqlSession.update(ns+"bbsLikeDelete", ldto);
	}
	
	

}