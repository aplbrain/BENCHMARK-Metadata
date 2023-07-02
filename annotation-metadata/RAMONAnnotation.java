@startuml
RAMONSegment <---> RAMONSynapse
RAMONSegment <---> RAMONSubcellular
RAMONSegment <---> RAMONROI
RAMONSegment <---> RAMONCell
RAMONSynapse <---> RAMONSubcellular
RAMONSynapse <---> RAMONROI
RAMONSynapse <---> RAMONCell
RAMONSubcellular <---> RAMONROI
RAMONSubcellular <---> RAMONCell
RAMONROI <---> RAMONCell

left to right direction

title Harmonized RAMON Nomenclature

class RAMONAnnotation{
Project: enum,
SegmentClass: enum,
Neuron: enum,
Synapses: enum,
Organelles: enum,
XYZ_ Offset: enum,
Resolution: byte,
ID: enum,
Confidence: enum,
KVPairs: enum,
Status: enum,
Author: string,
Last modified: enum,
URI: enum,
Annotation Representation: enum
----
*Annotator: 
	contributor(s) : enum, 
	contributor_method : enum, 
	novice_annotator : enum, 
	expert_annotator : enum, 
	novice_proofreader : enum, 
	expert_proofreader : enum, 
	other : str

*Score:
	user_validation : int, 
	annotation_used : int, 
	annotation_reviewed : int, 
	review_time_hours : int, 
	edit_amount : int,
	other : str

*Co-Registration:
	object_id : enum, 
	other : str

*Versioning:
	version_checkpoint_value : int, 
	version_checkpoint_updates : str, 
	other : str
}


class RAMONSegment{
Project: enum,
SegmentClass: enum,
Neuron: enum,
Synapses: enum,
Organelles: enum,
XYZ_ Offset: enum,
Resolution: byte,
ID: enum,
Confidence: enum,
KVPairs: enum,
Status: enum,
Author: string,
Last modified: enum,
URI: enum,
Annotation Representation: enum
----
Dendrite:
*Dendrite Properties: 
	apical_dendrite : boolean,
	basal_dendrite : boolean,
	base_neuron_id : enum

*Synapse Site:
	neuron_id : enum,
	type : str,
	class_label : str,

*Optional Dendrite Properties:
	number_dendriteskeleton_nodes : enum,
	number_dendriticspineskeleton_nodes : enum,
	number_ciliumskeleton_nodes : enum,
	dendritic_shaft : boolean,
	dendritic_spine : boolean

Axon:
	*Axon Properties: 
	axon_terminal  : boolean,
	myelinated_axon : boolean,
	base_neuron_id : enum,
	other : str

*Synapse Site:
		pre_synaptic_site : enum,
		neuron_id : enum,
		type : str,
		class_label : str, 
		other : str

*Optional Axon Properties:
	number_of_axons : enum,
	number_axonskeleton_nodes : enum,
	number_ciliumskeleton_nodes : enum,
	number_axoninitialsegmentskeleton_nodes : enum,
	number_myelinatedaxonskeleton_nodes : enum,
	other : str

}

class RAMONCell{
Project: enum,
ID: enum,
Confidence: enum,
KVPairs: enum,
Status: enum,
Author: string,
Last modified: enum,
URI: enum,
Annotation Representation: enum
----
Cell:
*Cell Types:
	neuron : str, 
	glia : str
	
	*Neuron Types:
	sensory_neurons: enum,
	motor_neurons : enum,
	interneurons: enum, 
	other : str

	*Glia Types: 
		astrocytes : enum,
		microglia : enum,
		oligodendrocyte : enum, 
		other : str

	*Optional Cell Properties:
		multipolar : enum,
		bipolar : enum,
		unipolar : enum,
		anaxonic : enum,
		blood_vessel_type : enum,
		interneuron-type : str,
        pyramidal : enum,
		c-shaped : enum,
        spiny-stellate : enum,
        excitatory/spiny-with-atypical-tree : enum,
        sparsely-spiny : enum,
        lots-of-spines : enum,
        possible-interneuron : enum,
        web-like-interneuron : enum,
        lot-of-axon : enum,
        EIRatio : enum,
		precursor : enum
}

class RAMONSubcellular{
Project: enum,
ID: enum,
Confidence: enum,
KVPairs: enum,
Status: enum,
Author: string,
Last modified: enum,
URI: enum,
Annotation Representation: enum
---
Organelles:
*Ribosomes : boolean,
*Endoplasmic_Reticulum : boolean,
*Mitochondria : boolean,
*Golgi_Apparatus : boolean,
*Spine_Apparatus : boolean,
*SynapticVesicle : boolean,
*Nucleus : boolean,
*Gap_Junctions : boolean,
*Myelin : boolean,
*Plasma Membrane : boolean

}

class RAMONROI{
Project: enum,
ID: enum,
Confidence: enum,
KVPairs: enum,
Status: enum,
Author: string,
Last modified: enum,
URI: enum,
Annotation Representation: enum
---
Regions of Interest:
*ROI:
	layer : enum,
	brain_regions : enum,
	cylinder : enum, 
	other : str
}


class RAMONSynapse{
Project: enum,
ID: enum,
Confidence: enum,
KVPairs: enum,
Status: enum,
Author: string,
Last modified: enum,
URI: enum,
Annotation Representation: enum
---
Synapse:
	*Chemical: 
		presynaptic : enum,
		postsynaptic : enum, 
		other : str

	*Electrical: 
		gap_junction_location : str, 
		gap_junction_id : enum, 
		other : str

	*Optional Synapse Properties:
	number_output_synapses : enum,
	number_input_synapses : enum,
	number_excitatory_synapses : enum,
	number_inhibitory_synapses : enum,
	number_outgoing_synapses : enum,
	number_incoming_synapses : enum,
	number_incomingexcitatory_synapses : enum,
	number_incominginhibitory_synapses : enum, 
	other : str

}

@enduml