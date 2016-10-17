package chatBox;

public class AlamLike implements Topic{

	private boolean inLikeLoop;
	private String likeResponse;
	public void talk() {
		AlamMain.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = AlamMain.getInput();
			int likePsn =AlamMain.findKeyword(likeResponse,  "like", 0);
			if(AlamMain.findKeyword(likeResponse,"like",0) >=0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				AlamMain.print("You are such and intresting person because you like " + thingsLiked);
				
				if(AlamMain.findKeyword(thingsLiked, "school", 0)>=0){
					
					inLikeLoop = false;
					AlamMain.school.talk();
				}else{
					
					inLikeLoop = false;
					AlamMain.talkForever();
				}
			}else{
				AlamMain.print("I don't understand you");
			}
		}
		
	}
	@Override
	public boolean isTriggered(String userInput) {
//		String[] triggers = {"school","class","teacher"};
		if(AlamMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(AlamMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		if(AlamMain.findKeyword(userInput, "teacher", 0) >= 0){
			return true;
		}
		return false;
	}

	
}
