package hello.jdbc.connection;

public abstract class ConnectionConst {
//     public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String URL = "jdbc:h2:~/test"; // ubuntu에서 위의 접속 URL 에러가 발생해 이 코드로 대체함

    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";
}
