package chatBox;

public class School implements Topic {
		
		private boolean inSchoolLoop;
		private String schoolsResponse;
		
		public School(){
			
		}
		
		public void talk(){
			inSchoolLoop = true;
			while(inSchoolLoop){
				AlamMain.print("Tell me about School");
				schoolsResponse = AlamMain.getInput();
				if (schoolsResponse.indexOf("stop")>= 0){
					inSchoolLoop = false;
					AlamMain.talkForever();
					
				}
				
				
				AlamMain.print("That's my favorite part about school too.");
			}
		}

		@Override
		public boolean isTriggered(String userInput) {
			// TODO Auto-generated method stub
			return false;
		}

}
