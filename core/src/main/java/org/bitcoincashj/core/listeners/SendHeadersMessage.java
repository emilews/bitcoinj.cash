package org.bitcoincashj.core.listeners;

import org.bitcoincashj.core.EmptyMessage;
import org.bitcoincashj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class SendHeadersMessage extends EmptyMessage{
    public SendHeadersMessage(NetworkParameters params){
        super(params);
    }
}
