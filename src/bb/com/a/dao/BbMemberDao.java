package bb.com.a.dao;

import bb.com.a.model.Bb_MemberDto;

public interface BbMemberDao {
	public Bb_MemberDto allMember() throws Exception;
	public boolean addMember(Bb_MemberDto mem) throws Exception;
}
