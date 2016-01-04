//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.12.17 um 02:48:56 PM CET 
//


package eu.open_ecvet.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für learningOutcomeListListType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="learningOutcomeListListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ecvetElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="learningOutcomeList" type="{}learningOutcomeListType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningOutcomeListListType", propOrder = {
    "learningOutcomeList"
})
@Entity
@Table(indexes = {

}, uniqueConstraints = {

}, name = "learningoutcomelistlist")
public class LearningOutcomeListListType
    extends EcvetElement
    implements Serializable
{

    @XmlElement(required = true)
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE,
        CascadeType.DETACH
    })
    @JoinTable(joinColumns = {
        @JoinColumn(name = "learningoutcomelistlist_id")
    }, inverseJoinColumns = {
        @JoinColumn(name = "learningoutcomelist_id")
    }, indexes = {

    }, uniqueConstraints = {

    })
    protected List<LearningOutcomeListType> learningOutcomeList;

    /**
     * Gets the value of the learningOutcomeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningOutcomeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningOutcomeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningOutcomeListType }
     * 
     * 
     */
    public List<LearningOutcomeListType> getLearningOutcomeList() {
        if (learningOutcomeList == null) {
            learningOutcomeList = new ArrayList<LearningOutcomeListType>();
        }
        return this.learningOutcomeList;
    }

}