package cs3500.controller;

/**
 * Represents the mutable functionalities of the clock. The clock can go forward in time, go
 * backward in time, and reset back to the beginning. The clock is synced up with the Timer object,
 * so the time kept by the clock is the same as the time of the Timer object.
 */
public interface TimeKeeper extends ReadTimeKeeper {
  /**
   * Move forward in time by one tick unit.
   */
  void increaseTime();

  /**
   * Go backward in time by one tick unit.
   */
  void decreaseTime();

  /**
   * Sets the time back to the beginning tick (= 0).
   */
  void reset();
}
