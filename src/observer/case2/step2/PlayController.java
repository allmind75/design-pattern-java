package observer.case2.step2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayController implements Publisher {
    /*
        CopyOnWriteArrayList : https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CopyOnWriteArrayList.html
        - Array add, remove 시 객체를 복사해서 사용
        - add, remove가 많이 발생하는 경우 성능저하 발생

        아래의 코드에서 ArrayList로 설정후 notifyObservers 호출시 ConcurrentModificationException 발생
        - ConcurrentModificationException : https://docs.oracle.com/javase/7/docs/api/java/util/ConcurrentModificationException.html
        - notifyObservers > forEach 내부에서 Iterator를 이용하는데 deleteObserver가 호출되면서 사용중인 collection이 수정되면서 오류 발생
    */
    private List<Observer> observers = new CopyOnWriteArrayList<>();
    private boolean play;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(play);
        }
    }

    public void setFlag(boolean play) {
        this.play = play;
        notifyObservers();
    }

    public boolean getFlag() {
        return play;
    }
}