package org.jqassistant.contrib.plugin.uml.api;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.Set;

@Label("AppliedStereotype")
public interface XMIAppliedStereotypeDescriptor extends XMIDescriptor {

    @Relation("OF_STEREOTYPE")
    XMIStereotypeDescriptor getStereotype();

    void setStereotype(XMIStereotypeDescriptor stereotype);


    @Relation("APPLIED_TO")
    XMIElementDescriptor getAppliedToElement();

    void setAppliedToElement(XMIElementDescriptor xmiElement);

    @Relation("HAS_ATTRIBUTE")
    Set<XMIAttributeDescriptor> getAttributes();
}
