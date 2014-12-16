package gueei.binding.v30.actionbar.attributes;

import gueei.binding.BindingType;
import gueei.binding.ViewAttribute;
import gueei.binding.v30.actionbar.BindableActionBar;
import gueei.binding.v30.toolbar.BindableToolbar;

public class Title extends ViewAttribute<BindableActionBar, CharSequence> {

	public Title(BindableActionBar view) {
		super(CharSequence.class, view, "title");
	}

	@Override
	protected void doSetAttributeValue(Object newValue) {
		if (newValue==null){
			getHost().getSupportActionBar().setTitle("");
			return;
		}
		if (newValue instanceof CharSequence){
			getHost().getSupportActionBar().setTitle((CharSequence)newValue);
			return;
		}
		getHost().getSupportActionBar().setTitle(newValue.toString());
	}

	@Override
	public CharSequence get() {
		return getHost().getSupportActionBar().getTitle();
	}

	@Override
    protected BindingType AcceptThisTypeAs(Class<?> type) {
		return BindingType.OneWay;
    }
}