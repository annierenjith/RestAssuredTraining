package api.endpoints;

/*Base URL: https://petstore.swagger.io/v2

POST URL: https://petstore.swagger.io/v2/user
GET URL: https://petstore.swagger.io/v2/user/{username}
PUT URL :https://petstore.swagger.io/v2/user/{username}
DELETE URL :https://petstore.swagger.io/v2/user/{username}


*/
public class Routes {

	public static String  base_url = "https://petstore.swagger.io/v2" ;
	
	public static String  post_url = base_url+"/user";
	public static String  get_url = base_url+"/user/{username}";
	public static String  put_url = base_url+"/user/{username}";
	public static String  delete_url = base_url+"/user/{username}";
	
}
