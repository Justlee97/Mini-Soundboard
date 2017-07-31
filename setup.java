public void setup(){
		String[] FileNameStrings = {"Q", "W","E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\",
				"A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'",
				"Z", "X", "C", "V", "B", "N", "M", "," ,".", "/", 
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
		};
		
		for(int i = 0; i < 44; i++){
			String s = FileNameStrings[i];
			Button currBt = new Button(s);	

			currBt.setPrefSize(50, 50);
			currBt.setOnAction(e -> {
				currKey = currBt;
				currKey.setText(s);
				select.setText("Selected Key: " + s);
			});
			if(i <= 12) grid.add(currBt, i, 1);
			if(i >= 13 && i <= 23) grid.add(currBt, i - 12, 2);
			if(i >= 24 && i <= 33) grid.add(currBt, i - 23, 3);
			if(i >= 34 && i <= 43) grid.add(currBt, i - 33, 0);
		}
		
		this.keyboard = new Keyboard();
	}