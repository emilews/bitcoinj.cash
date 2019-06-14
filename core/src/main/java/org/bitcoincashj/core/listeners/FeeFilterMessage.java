package org.bitcoincashj.core.listeners;

import org.bitcoincashj.core.EmptyMessage;
import org.bitcoincashj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class FeeFilterMessage extends EmptyMessage{
    public FeeFilterMessage(NetworkParameters params){
        super(params);
    }
}
