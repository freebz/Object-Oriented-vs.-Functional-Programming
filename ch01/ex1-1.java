// CHAPTER 1 Lambdas: Parameterizing Code by Behavior

// Why Do I Need to Learn About Lambda Expressions?

// The Basics of Lambda Expressions

// Example 1-1. Using an anonymous inner class to associate behavior with a button click

button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			System.out.println("button clicked");
		}
	});
