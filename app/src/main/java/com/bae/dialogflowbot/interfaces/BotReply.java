package com.bae.dialogflowbot.interfaces;

import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.protobuf.InvalidProtocolBufferException;

public interface BotReply {

  void callback(DetectIntentResponse returnResponse) throws InvalidProtocolBufferException;
}
