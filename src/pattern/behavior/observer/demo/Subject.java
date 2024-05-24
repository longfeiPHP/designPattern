package pattern.behavior.observer.demo;

/**
 * 抽象主题接口
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
