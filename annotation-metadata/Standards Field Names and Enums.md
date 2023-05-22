---
# **Required Field Names Standards**
---


# **Data Types**
| Data Type       | Details  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Integer (int) | Values with long integer will be allowed to have up to 6 digits | A whole number that is denoted as positive,  negative,  or zero |
| Float | A floating-point number | A number that has a decimal place |
| String (str) | A sequence of characters used to represent text | A sequence of characters | 
| Enumeration (enum) |  User-defined type | Defined set of values | 
|Boolean | True or false defined type | yes,  no |
---

# **Classes**
| Class         | Entities         |
| ---------------- | ---------------- |
|Cell|Neuron, Glia, Regions of Interest, Optional Properties|
|Mitochondria|Optional Properties|
|Dendrite|Dendrite Properties, Synapse Site, 
|Spine|Optional Properties|
|Soma|Optional Properties|
|Synapse|Chemical, Electrical, Optional Properties|
|Organelles|Ribosomes, Endoplasmic_Reticulum, Mitochondria, Golgi_Apparatus, Spine_Apparatus, SynapticVesicle, Nucleus, Gap_Junctions, Myelin, Plasma Membrane|
|Nucleus|Nucleolus|
|Axon|Axon Properties, Synapse Site, Optional Axon Properties|
|Synaptic Vesicle| ... |
|Axon Initial Segment|Myelin|
|Spine_Apparatus|...|
|Cleft|...|
|Cilia|...|
|Shaft|...|
|Bouton|...|
|Myelin|...|
|All_cell_compartments|...|


# **Cell**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Neuron|enum|sensory_neurons, motor_neurons, interneurons|Cell that transmits nerve impulses|
|Glia|enum|astrocytes, microglia, oligodendrocyte|Works to protect and support neurons in the central nervous system|
|Regions of Interest|enum|layer, brain_regions_cylinder|Relevant measurement range|
|Optional Properties|enum|multipolar, bipolar, unipolar, anaxonic, interneuron-type, pyramidal, c-shapes, excitatory/spiny-with-atypical-treem, sparsely-spiny, lots-of-spines,  web-like-interneuron, lot-of-axon, EIRatio, precursor| Optional documentation of cells|


# **Mitochondria**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Optional Properties|enum|lipids, proteins| Optional documentation of lipids and proteins found in the mitochondria |



# **Dendrite**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Dendrite Properties|boolean|apical_dendrite, basal_dendrite|  Dendrite property types depicted as boolean values  |    
|Dendrite Properties|enum|base_neuron_id| Dendrite property types depicted as enumerations |
|Synapse Site|enum|neuron_id| The location where nerve impulses are transmitted and received (enum)|
|Synapse Site|str|type, class_label| The location where nerve impulses are transmitted and received (str)|

# **Spine**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
|Optional Properties|enum|number_of_spines| Applicable spine property types depicted as enumerations |
|Optional Properties|str|spine_protrusions| Applicable spine  property types depicted as strings |


# **Soma**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
|Optional Properties|boolean|cell body| Soma optional properties depicted as boolean,  determines whether or not there is a cell body|


# **Synapse**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
|Chemical|enum|presynaptic, postsynaptic| Specialized sites that transmit signals between presynaptic neurons and their respective postsynaptic targets
| Electrical | enum | gap_junction |
| Optional Properties | enum | number_output_synapses,  number_input_synapses, number_excitatory_synapse, number_inhibitory_synapses, number_outgoing_synapses, number_incoming_synapses, number_incomingexcitatory_synapses, number_incominginhibitory_synapses| Synapse optional properties and its corresponding values |


# **Organelles**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| Ribosomes | boolean | yes, no | A structure composed of RNA and proteins to aid in protein synthesis |
| Endoplasmic_Reticulum | boolean | yes, no | Sac-like structure in the cytoplasm of a cell that helps aid protein movement |
| Mitochondria | boolean | yes, no | Powerhouse of cell that generates chemical energy |
| Golgi_Apparatus | boolean | yes, no | Folded vesicles that form a stack of flat slacs in the cell's cytoplasm to prepare lipids and proteins for transport |
| Spine_Apparatus | boolean | yes, no | Specialized form of endoplasmic reticulum located in the dendritic spine |
| SynapticVesicle | boolean | yes, no | Vesicles that store presynaptic terminals and neurotransmitters |
| Nucleus | boolean | yes, no | Membrane enclosed organelle in a cell |
| Gap_Junctions | boolean | yes, no | Clusters of channels that allow for diffusion of ions and small molecules |
| Myelin | boolean | yes, no | Sheath formed around nerves composed of fatty substances |
|Plasma Membrane | boolean | yes, no | Microscopic membrane of lipids and proteins that surrounds cytoplasm |

# **Nucleus**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| Nucleolus | boolean | yes, no | Composed of RNA and proteins in the nucleus |


# **Axon**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| Axon Properties | boolean | axon_terminal, myelinated_axon | Axon property boolean types |
| Axon Properties | enum | base_neuron_id | Axon enumeration property types |
| Synapse Site | enum | pre_synaptic_site, neuron_id, type | Synapse site enumeration types  |
| Synapse Site | str | class_label |  Synapse site string types |
| Optional Axon Properties | enum | number_of_axons, number_axonskeleton_nodes, number_ciliumskeleton_nodes,  number_axoninitialskeleton_nodes, number_myelinatedaxonskeleton_nodes | Optional axon enumeration property types |

# **SynapticVesicle**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **Axon_Initial_Segment**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| Myelin | boolean | yes, no | Sheath formed around nerves composed of fatty substances |

# **Spine_Apparatus**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **Cleft**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **Cilia**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **Shaft**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **Bouton**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **Myelin**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |

# **All_cell_compartments**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| ... | ... | ... | ... |
