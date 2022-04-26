package resolved;

public interface IUser {
	boolean login(String username, String password);
	boolean register (String username, String email, String password);

}
