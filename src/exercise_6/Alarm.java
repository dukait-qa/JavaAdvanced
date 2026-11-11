package exercise_6;

import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
    private AlarmListener[] listeners = {};

    public void addListener(AlarmListener alarmListener){
        AlarmListener[] mewListeners = new AlarmListener[listeners.length + 1];

        System.arraycopy(listeners,0, mewListeners, 0, listeners.length);
        mewListeners[listeners.length] = alarmListener;
        listeners = mewListeners;
    }

    public void removeListener(AlarmListener alarmListener){
        int indexOfElementToRemove = -1;

        for(int i = 0; i < listeners.length; i++){
            if(alarmListener.equals(listeners[i]))
                indexOfElementToRemove = i;
        }

        AlarmListener[] mewListeners = new AlarmListener[listeners.length - 1];
        System.arraycopy(listeners, 0, mewListeners, 0, indexOfElementToRemove);

        System.arraycopy(listeners, indexOfElementToRemove + 1,
                mewListeners, indexOfElementToRemove,
                listeners.length - indexOfElementToRemove - 1);

        listeners = mewListeners;
    }

    public void setTimeFromNow(int millis) {
        Timer timer = new Timer("Timer");
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("AlarmEvent triggered...");

                for(AlarmListener listener : listeners){
                    AlarmEvent eventObj = new AlarmEvent(this, "Time is up!");
                    listener.alarmRang(eventObj);
                }

                System.exit(0);

            }
        }, millis);
    }
}
