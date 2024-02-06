
# **Required Field Names**
---

This table represents the gathering neurodata annotations field names, their data type, and allowed values. By defining the field names, users can establish a standardized structure for organizing the annotations. This helps in ensuring consistency and retrieval of information. Class diagrams can be used to depict relationships within the annotation structure (reflecting plant UML structures can be located at: BENCHMARK-Metadata/annotation-metadata/annotation-metadata-version-#). Each class has a corresponding entity, data type, and allowed values.

<img width="1203" alt="Screen Shot 2023-06-01 at 10 58 23 AM" src="https://github.com/aplbrain/BENCHMARK-Metadata/assets/66258538/297a967c-a847-419e-814a-39700293567a">

A class can have multiple entities or corresponding data types, each representing a different piece of data associated with the object. Each data type associated with it, such as integer, float, string, enumeration, or boolean, depends on the data being annotated. It's also possible to have multiple attributes of the same or different data types within a class.

<img width="1116" alt="Screen Shot 2023-06-01 at 10 59 44 AM" src="https://github.com/aplbrain/BENCHMARK-Metadata/assets/66258538/77f28ae5-c305-4469-81fb-34fea28dcd20">

Neuroscience data can be diverse and complex, requiring flexible approaches to accommodate different designs and analysis. This growing set of definitions seeks to allow users to explicitly define values while maintaining fluidity for collaboration. 

# **Data Types**
| Data Type       | Details  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Integer (int) | Values with long integer will be allowed to have up to 6 digits | A whole number that is denoted as positive,  negative,  or zero |
| Float (float)| A floating-point number | A number that has a decimal place |
| String (str) | A sequence of characters used to represent text | A sequence of characters, alphanumeric values, or letters | 
| Enumeration (enum) |  User-defined type | Pre-defined set of values that are applicable to a specific entity | 
|Boolean (boolean) | True or false defined type | yes,  no |
| Other (str) | A sequence of characters used to represent pending text | A sequence of characters, alphanumeric values, or letters | 

---

# **Classes**
| Class         | Entities         |
| ---------------- | ---------------- |
|Annotation Provenance |Annotator, Score, Co-Registration, Versioning|
|Cell|Cell Types, Neuron Types, Glia Types, Regions of Interest, Optional Cell Properties|
|Mitochondria|Optional Mitochondria Properties|
|Dendrite|Dendrite Properties, Synapse Site, Optional Properties|
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

---
 **Annotation Provenance**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Annotator|enum|contributor(s), contributor_method, novice_annotator, expert_annotator, novice_proofreader, expert_proofreader|Keeping track of users, their roles, and methods in the annotation process provides insights into their expertise, potential biases, and reliability of their contributions|
|Annotator|other|string text|Annotator properties that are not defined|
|Score| int | user_validation, annotation_used, annotation_reviewed, review_time_hours, edit_amount| Assigning a depersonalized score from source of the annotation (individual or method used), the number of users who validated it, the number of times it has been used or reviewed, and other relevant metrics will foster a quality-controlled annotation|
|Score|other|string text|Score properties that are not defined|
|Co-Registration|enum|object_id|A field for co-registration, annotation objects can serve as connectors between datasets, providing a means to navigate and integrate information from various sources|
|Co-Registration||other|string text|Co-Registration properties that are not defined|
|Versioning|int|version_checkpoint_value|Annotation version value (i.e., Version "1", "1,1", etc.)|
|Versioning|str|version_checkpoint_updates|Documenting changes made in version|
|Versioning|other|str|Other version properties not currently defined|


# **Cell**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Cell Types|boolean|neuron, glia|Cell that work to protect and support neurons in the central nervous system|
|Neuron Types|enum|sensory_neurons, motor_neurons, interneurons|Types of neurons that transmit nerve impulses|
|Neuron Types|other|string text|Types of neurons that transmit nerve impulses that do not fit the defined options|
|Glia Types|enum|astrocytes, microglia, oligodendrocyte|Types of glia that protect and support neurons in the central nervous system|
|Glia Types|other|string text|Types of glia that protect and support neurons in the central nervous system that does not fit the defined options|
|Regions of Interest|enum|layer, brain_regions_cylinder|Relevant measurement range|
|Regions of Interest|other|string text|Relevant measurement range that does not fit the defined options|
|Optional Cell Properties|enum|multipolar, bipolar, unipolar, anaxonic, blood_vessel_type, interneuron-type, pyramidal, c-shapes, excitatory/spiny-with-atypical-treem, sparsely spiny, lots-of-spines,  web-like-interneuron, lot-of-axon, EIRatio, precursor| Optional documentation of cells|
|Optional Cell Properties|other|string text| Optional documentation of cells that does not fit the defined options|

# **Mitochondria**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Optional Mitochondria Properties|enum|lipids, proteins| Optional documentation of lipids and proteins found in the mitochondria |
|Optional Mitochondria Properties|other|string text| Optional documentation of lipids and proteins found in the mitochondria that does not fit the defined options |


# **Dendrite**
| Entity           | Data Type      | Allowed Values | Definition | 
| ---------------- | -------------- | -------------- | ---------- |
|Dendrite Properties|enum|apical_dendrite, basal_dendrite, base_neuron_id|  Dendrite property types (enum)  |    
|Dendrite Properties|other|string text|  Dendrite property types that does not fit the defined options |    
|Synapse Site|enum|type, class_label, neuron_id| The location where nerve impulses are transmitted and received (enum)|
|Synapse Site|other|string text| The location where nerve impulses are transmitted and received that does not fit the defined options|
| Optional Dendrite Properties | enum | number_dendriteskeleton_node, number_dendriticspineskeleton_nodes, number_ciliumskeleton_nodes,  dendritic_shaft, dendritic_spine | Optional dendrite enumeration property types |
| Optional Dendrite Properties | other | string text | Optional dendrite properties that do not fit the defined options |


# **Spine**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
|Optional Properties|int|number_of_spines| Number of spines |
|Optional Properties|str|spine_protrusions| Applicable spine  property types depicted as strings |
|Optional Properties|other|string text| Applicable spine property types that do not fit the defined options |

# **Soma**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
|Optional Properties|boolean|cell body| Soma optional properties depicted as boolean, determines whether or not there is a cell body|
|Optional Properties|other|string text| Soma optional property types that do not fit the defined options |


# **Synapse**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
|Chemical|enum|presynaptic, postsynaptic| Specialized sites that transmit signals between presynaptic neurons and their respective postsynaptic targets|
|Chemical|other|string text| Specialized sites that transmit signals between presynaptic neurons and their respective postsynaptic targets that does not fit the defined options|
| Electrical | enum | gap_junction_location |  The location where channels that allow for cell to cell transfers between ions and small molecules|
| Electrical | str | gap_junction_id | The identification tag for gap junctions|
| Electrical | other | string text |  Electrical properties that do not fit the defined options| 
| Optional Properties | enum | number_output_synapses,  number_input_synapses, number_excitatory_synapse, number_inhibitory_synapses, number_outgoing_synapses, number_incoming_synapses, number_incomingexcitatory_synapses, number_incominginhibitory_synapses| Synapse optional properties and its corresponding values |
| Optional Properties | other | string text| Synapse optional properties that do not fit the defined options|


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
| Plasma Membrane | boolean | yes, no | Microscopic membrane of lipids and proteins that surrounds cytoplasm |

# **Nucleus**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| Nucleolus | boolean | yes, no | Composed of RNA and proteins in the nucleus |
| Nucleolus | other | string text | Nucleus properties that do not fit the defined options |


# **Axon**
| Entity           | Data Type      | Allowed Values | Definition |
| ---------------- | -------------- | -------------- | ---------- |
| Axon Properties | enum | axon_terminal, myelinated_axon | Axon property boolean types |
| Axon Properties | str | base_neuron_id | Axon string property types |
| Axon Properties | other | string text | Axon property types that do not fit the defined options |
| Synapse Site | enum | pre_synaptic_site, type, class_label | Synapse site enumeration types  |
| Synapse Site | str | neuron_id |  Synapse site string types |
| Synapse Site | other | string text |  Synapse site that does not fit the defined options |
| Optional Axon Properties | enum | number_of_axons, number_axonskeleton_nodes,  number_axoninitialskeleton_nodes, number_myelinatedaxonskeleton_nodes | Optional axon enumeration property types |
| Optional Axon Properties | other |string | Optional axon property types that do not fit defined properties|

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


