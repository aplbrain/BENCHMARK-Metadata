
# ***Required Field Names***

![fieldNames](https://img.shields.io/badge/BENCHMARK-fieldNames-FFFC33)

<br/><br/> 

## **Contributors**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| contributorName  |  Person (last name, first name) or organization (e.g., research group, department, institution) contributing to or responsible for the project, but does not include funders of the project. If a contributor has more than one contributorType, use a separate line for each.  | String |
| Creator | Main researchers involved in producing the data. There must be at least one creator. | String |
| contributorType | Categorization of the role of the contributor. Recommended: ProjectLeader (for principal investigator), ResearchGroup (for lab, department, or division). | String | 
| nameType | Type of contributorName | String |
---
---
<br/><br/> 

# **Data Type**
| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| objectID | ... | 0 $\leq$ ObjectID $\leq$ nE|
| smallInt | Indicates a value of 1 or 2 | 1 or 2 | 
| Interger | Values with long integer will be allowed to have up to 6 digits | 0 $\leq$ int $\leq$ 6 |
| longNumber | Values with long integer will be allowed to have up to 6 digits | 0 <= nLong 11  |
| Float | ... | 0 $\leq$ float $\leq$ -nE |
| String | Add Definition Here | 0 $\leq$ str $\leq$ 9 | 
---
---

<br/><br/> 

# **Synapses**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| preSynaptic | At the end of an axon and is the place where the electrical signal (the action potential) is converted into a chemical signal (neurotransmitter release). | Boolean |
| postSynaptic | Side of the synapse is specialized to receive the neurotransmitter signal released from the presynaptic terminal and transduce it into electrical and biochemical changes in the postsynaptic cell. | Boolean |
| Synaptic Cleft | This is the space that separates a neuron and its target cell at a chemical synapse. | Boolean |
| Chemical | Connections between two neurons or between a neuron and a non-neuronal cell (muscle cell, glandular cell, sensory cell. | Boolean |
| Electrical | Specialized connections between neurons that facilitate direct ionic and small metabolite communication | Boolean |
| neuron_id | Neuron identity number |int |
| id | Cell identity number  | int |
| type | The pre synaptic site type determines if the site is pre-synaptic or post-synaptic using a value of 1 and 2; where the value of 1 is the pre-synaptic site. | int |
| class_label | The neuron has many parts to it. Class label identifies what part of the neuron is being evaluated. (e.g., Axon, Soma, Dendrite, or Unknown) | str |
| base_neuron | Each neuron on the dataset will have an ID number to identify it. | int |
<br/><br/> 

---
---
<br/><br/> 

# **Cells**

## **multipolarNeurons**
| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| pyramidalCell | A type of multipolar neuron found in areas of the brain including the cerebral cortex, the hippocampus, and the amygdala. | Boolean |
| purkinjeCell | Unique type of neuron-specific to the cerebellar cortex.  | Boolean | 
| stellateCell | neurons in the central nervous system, named for their star-like shape formed by dendritic processes radiating from the cell body. | Boolean |
| fusiformCell | Principal cell type in the dorsal cochlear nucleus. | Boolean |
| glomerularCell | Made up of three cell types, the endothelial cells, the podocytes and the mesangial cells (MCs) | Boolean |
| granuleCell | The smallest and most numerous type of neurons in the brain | Boolean |
<br/><br/> 

## **Neuron Properties**
| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| _id | Each neuron has its own ID to be identified by. | int |
| volume | Abundance of id’s | int | 
| number_outgoing_synsapses | The number of synapses that are coming from a neuron. | int |
| number_incoming_synapses | The number of synapses that are going into a neuron. | int |
| number_incomingexcitatory_synapses | Add Definition Here | int |
| number_incominginhibitory_synapses | Add Definition Here | int | 
| number_dendriteskeleton_node | The number of nodes located on the dendrite skeleton | int | 
| number_axonskeleton_nodes | The number of nodes located on the axon skeleton | int |
| number_dendriticspineskeleton_nodes | The number of nodes located on the dendrite skeleton | int | 
| number_ciliaskeleton_nodes | The number of nodes located on the cilium skeleton | int |
| number_axoninitialsegmentskeleton_nodes | The number of nodes located on the axon initial; segment skeleton for a given neuron | int |
| number_myelinatedaxonskeleton_nodes | The number of nodes located on the myelinated axon skeleton | int |
| layer | Layers will determine what section/layer of the brain is being analyzed. | int | 
<br/><br/> 

## **Glia**
| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Astrocytes | Specialized glial cells that outnumber neurons by over fivefold. | Boolean |
| ependymalCell | A cell that forms the lining of the fluid-filled spaces in the brain and spinal cord. | Boolean | 
| Microglia | the most prominent immune cells of the central nervous system (CNS) and are the first to respond when something goes wrong in the brain | Boolean |
| Oligodendrocyte | The myelinating cells of the central nervous system (CNS) | Boolean |
---
---


<br/><br/> 

## **Extra Category**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Axon | Transmit information moving in one direction from the dendrites through the axon to the next neuron. The axon is connected to the Presynaptic sending a chemical to be released into the Postsynaptic. | int<br/> Boolean |
| Axosomatic | A synapse that’s made onto the soma or the cell body of a neuron | int<br/> Boolean |
| Blood Vessel | Arteries, veins, capillaries that function to carry blood throughout the body to aid in circulation | int<br/> Boolean |
| Dendrite | Connects to other neurons receiving information from other neurons (Greek from dendron mean tree) | int<br/> Boolean |
| Dendritic Spine (Spine) | small membranous protrusion that is on the dendrite receiving transmitted information from the axon. | int<br/> Boolean |
| Endoplasmic Reticulum | Sac-like structure in the cytoplasm of a cell that proteins move through | int<br/> Boolean |
| Excitatory Synapse | Increases the likelihood of firing action potential of a cell | int<br/> Boolean |
| Golgi Apparatus | Sorts together proteins that are send from the ER and send them back out to the different cells. (e.g., Lysosomes, plasma membrane secretion) | int<br/> Boolean |
| Inhibitory Synapse | Decreases the likelihood of firing action potential of a cell | int<br/> Boolean |
| Microtubules | Form the cell cytoskeleton to regulate cell growth and movement| int<br/> Boolean |
| Mitochondria | Powerhouse of cell that generates chemical energy needed | int<br/> Boolean |
| Neuropil | A fibrous network of nervous tissue that forms the gray matter of the brain | int<br/> Boolean |
| Perikaryon | Part of the cell body where the nucleus is located | int<br/> Boolean |
| Recceptor | Neurotransmitter molecules are released from a neuron they pass the signal to the next neuron to interact with receptors on that neuron. | int<br/> Boolean |
| Ribosomes | A structure composed of RNA and protein that functions as protein synthesis | int<br/> Boolean |
| Soma | Cell body of a neuron contains the nucleus and other structures common to living cells. | int<br/> Boolean |
| Spine Apparatus | Regulates calcium movements and helps regulate protein synthesis | int<br/> Boolean |
Synaptic Cleft | This is the space that separates a neuron and its target cell at a chemical synapse. | int<br/> Boolean |
| Synaptic Vesicle | Presynaptic terminals that store neurontransmitters | int<br/> Boolean |
---
