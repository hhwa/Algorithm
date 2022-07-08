package new_id;

public class New_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testid ="...!@BaT#*..y.abcdefghijklm";
		System.out.println(new_id(testid));
	}
	
	public static String new_id(String new_id) {
		String answer = new_id;
        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^0-9a-z-_.]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");
        
        if(answer.equals("")){
            answer += "a";
        }
        
        if(answer.length() >= 16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        }
        
        if(answer.length() <= 2){
            int len = 3-answer.length();
            for(int i=0; i<len; i++){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
	}

}
