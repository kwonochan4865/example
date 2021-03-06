package chapter9.nestedclassinfterface;

public class Button14 {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();   
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
