package Chess.src;

// Final Project: Uliana Boikova

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

/**
 The NodeUtils class should return all nodes from the pane.
 */
public class NodeUtils {

    /**
     Returns all nodes from the pane.
     * @param parent the pane
     * @return list of nodes from the pane.
     * @param <T> class NodeUtils.
     */
    public static <T extends Pane> List<Node> paneNodes(T parent) {
        return paneNodes(parent, new ArrayList<Node>());
    }


    private static <T extends Pane> List<Node> paneNodes(T parent, List<Node> nodes) {
        for (Node node : parent.getChildren()) {
            if (node instanceof Pane) {
                paneNodes((Pane) node, nodes);
            } else {
                nodes.add(node);
            }
        }
        return nodes;
    }
}
