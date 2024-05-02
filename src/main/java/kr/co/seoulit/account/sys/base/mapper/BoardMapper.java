package kr.co.seoulit.account.sys.base.mapper;

import java.util.ArrayList;

import kr.co.seoulit.account.sys.base.to.BoardFIleBean;
import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.account.sys.base.to.BoardBean;
@Mapper
public interface BoardMapper {

	ArrayList<BoardBean> selectDetailBoardList1(String id);



	ArrayList<BoardBean> selectParentBoardList();

	BoardBean selectBoardId(String id);

	BoardBean selectDetailBoardList(String id);

	void deleteBoardList(String id);

	void insertBoard(BoardBean boardbean);

	void updateBoard(BoardBean boardbean);





	void boardModify(BoardBean boardbean);





	ArrayList<BoardBean> selectreplyList(String id);

	void updateLookup(String id);


	void selectParentBoardList2();

	void insertReBoard(BoardBean boardbean);

	void deleteReBoard(String rid);

	void modifyReBoard(BoardBean boardbean);

	void fileInsert(BoardBean boardBean) throws Exception;
//	void fileInsert(BoardFIleBean boardFIleBean) throws Exception;

}
