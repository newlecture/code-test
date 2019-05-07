package y2019.m05.d03;

import java.util.List;

public interface MemberDao {
	Member get(String id);
	List<Member> getList();
	List<Member> getList(String query);
}
