package ubicomp.soberdiary.statistic.ui.questionnaire.listener;

import ubicomp.soberdiary.main.R;
import ubicomp.soberdiary.statistic.ui.QuestionnaireDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SelectedListener implements OnClickListener {

	private QuestionnaireDialog msgBox;
	private View.OnClickListener listener;
	private int str_id;
	
	public SelectedListener(QuestionnaireDialog msgBox, View.OnClickListener listener,int str_id){
		this.msgBox = msgBox;
		this.listener = listener;
		this.str_id = str_id;
	}
	
	@Override
	public void onClick(View v) {
		msgBox.cleanSelection();
		ImageView img = (ImageView) v.findViewById(R.id.questionnaire_button);
		img.setImageDrawable(msgBox.getChoiceSelectedDrawable());
		msgBox.setNextButton(str_id, listener);
	}

}
