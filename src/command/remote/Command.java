package command.remote;

/**
 * @author dengb
 */
public interface Command {

    /**
     * 执行。
     */
    void execute();

    /**
     * 撤销。
     */
    void undo();
}
