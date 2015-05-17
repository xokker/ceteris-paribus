package com.xokker.predictor.impl;

import com.xokker.PreferenceContext;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;

/**
 * @author Ernest Sadykov
 * @since 17.05.2015
 */
public class J48Predictor<A> extends WekaPredictor<A> {

    public J48Predictor(PreferenceContext<A> context) {
        super(context);
    }

    @Override
    protected Classifier createClassifier() {
        return new J48();
    }

    @Override
    protected String[] getOptions() {
        return new String[]{"-U", "-M", "1"};
    }
}
