package com.swmansion.gesturehandler.react;

public interface GestureHandlerInteractionController {
  boolean shouldWaitForHandlerFailure(GestureHandler handler, GestureHandler otherHandler);
  boolean shouldRequireHandlerToWaitForFailure(GestureHandler handler, GestureHandler otherHandler);
  boolean shouldRecognizeSimultaneously(GestureHandler handler, GestureHandler otherHandler);
  boolean shouldHandlerBeCancelledBy(GestureHandler handler, GestureHandler otherHandler);
}
