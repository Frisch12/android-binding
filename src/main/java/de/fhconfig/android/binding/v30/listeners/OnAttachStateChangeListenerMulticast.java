package de.fhconfig.android.binding.v30.listeners;

import android.view.View;

import de.fhconfig.android.binding.listeners.ViewMulticastListener;

public class OnAttachStateChangeListenerMulticast extends ViewMulticastListener<View.OnAttachStateChangeListener> implements View.OnAttachStateChangeListener {
	@Override
	public void registerToView(View v) {
		v.addOnAttachStateChangeListener(this);
	}

	public void onViewAttachedToWindow(View v) {
		for (View.OnAttachStateChangeListener l : listeners) {
			l.onViewAttachedToWindow(v);
		}
	}

	public void onViewDetachedFromWindow(View v) {
		for (View.OnAttachStateChangeListener l : listeners) {
			l.onViewDetachedFromWindow(v);
		}
	}
}