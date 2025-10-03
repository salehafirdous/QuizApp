package com.elevatelabs.tasks.task8;

public class Question {
	private String text; // Question text
	private String[] options; // Array of options
	private int correctIndex; // index of the correct option

	public Question(String text, String[] options, int correctIndex) {
		this.text = text;
		this.options = options;
		this.correctIndex = correctIndex;
	}

	public String getText() {
		return text;
	}

	public String[] getOptions() {
		return options;
	}

	public int getCorrectIndex() {
		return correctIndex;
	}
}
