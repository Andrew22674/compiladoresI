/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;
import java_cup.runtime.Symbol;

/**
 *
 * @author Carlos Rivera
 */
public class Node {

    public String tag;
    Node parent;
    public ArrayList<Node> leaf = new ArrayList<>();
    public String value;
    public int id;
    // public String tipo;

    // etiqueta
    
    public Node(){
        
    
    }
    public Node(Node parent, Symbol value) {
        this.parent = parent;
        this.value = value.toString();
    }
    
    public Node(Node parent, String value) {
        this.parent = parent;
        this.value = value;
    }

    /*public Node(Node parent, String value) {
        this.parent = parent;
        this.value = new Symbol(-1, 0, 0, value);
    }*/
    public void setTag(String t) {
        tag = t;
    }

    public String getTag() {
        return tag;
    }

    // hijos
    public void addLeafs(Node n) {
        leaf.add(n);
    }

    public void addLeafs(ArrayList<Node> n) {
        leaf.addAll(n);
    }

    public ArrayList<Node> getLeafs() {
        return leaf;
    }

    // valor
    public void setValue(String v) {
        value = v;
    }

    public String getValue() {
        return value;
    }

    // id
    public void setID(int i) {
        id = i;
    }

    public int getID() {
        return id;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void removeParent() {
        this.parent = null;
    }

    public Node getParent() {
        return this.parent;
    }
}
