package androthello.model;

/**
 * Created by Strauss on 23/02/2016.
 */
public interface CellState {
    CellState white();
    CellState black();
    int color();
}
