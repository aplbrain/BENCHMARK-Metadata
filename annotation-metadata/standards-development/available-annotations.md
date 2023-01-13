---
Title: Representing H01 and Kasthuri Data 
About: Understanding what annotations in H01 and Kasthuri in using the draft standard, and can we represent the available annotations for other bossdb datasets (not yet in the connectomics query db) in the updated format. If not, evaluate what is missing that we need to add. 
Author: Nicole Guittari
Date: 09/2022

---

# Evaluating information found in Dataset versus Data Standards 

####  
Information found in [H01 Dataset](https://h01-release.storage.googleapis.com/explore.html) and [Kasthuri](https://bossdb.org/project/kasthuri2015) can be analyzed to sort out what information is needed to represent annotations through its corresponding Neuroglancer demonstration. 

Neuroglancer displays a variety of information regarding the physical make-up of neurons. 

As within, annotation standards, the variety of collections can be assessed. This will confirm what is best to represent the data.  

1. `Property Name` represents the variable use in BossDB/Neuroglancer and whether it is and/or is not in the query server. 
2. This is indicated by ` Property Present in Neuroglancer` and `Property Present in Query Server`. 
3. The `Type` indicates the variable primitive data type ( includes byte , short , int , long , float , double , boolean and char). 
4. The `Class(es)` indicate where the variable is located

| # | Property Name                   | Property Present in Neuroglancer         | Property Present in Query Server               | Type    | Class(es)   |
| - | ------------------------------- | ---------------------------------------- | ---------------------------------------- |------   | ------      |
| 1 | EIRatio                         | No                                       | Yes                                      | int     |  Cell           |
| 2 | Astrocytes                      | No                                       | Yes                                      | Boolean | Cell & Dendrite|
| 3 | Ependymal_cell                  | No                                       | Yes                                      | Boolean | Cell & Dendrite|
| 4 | Microglia                       | No                                       | Yes                                      | Boolean | Cell & Dendrite|
| 5 | Oligodendrocyte                 | No                                       | Yes                                      | Boolean | Cell & Dendrite|
| 6 | Oligodendrocyte_Precursor       | No                                       | Yes                                      | Boolean | Cell & Dendrite|
| 7 | Apical_dendrite                 | No                                       | Yes                                      | Boolean |        Dendrite|
| 8 | Basal_dendritev                 | No                                       | Yes                                      | Boolean |         Dendrite|
|9 | Axon                           | No                                      | Yes                                      |int | Axon |
|10 | L1                              | Yes                                      | Yes                                      | int | Cell | 
|11 | L2                              | Yes                                      | Yes                                      | int | Cell |
|12 | L3                              | Yes                                      | Yes                                      | int | Cell |
|13 | L4                              | Yes                                      | Yes                                      | int| Cell |
|14 | L5                              | Yes                                      | Yes                                      | int| Cell |
|15 | L6                              | Yes                                      | Yes                                      | int | Cell |
|16 | WM                              | Yes                                      | Yes                                      | int | Cell |
|17 | layer-unclassified              | No                                       | Yes                                      |int | Cell |
|18 | pyramidal                       | Yes                                      | Yes                                      |int | Cell |
|19 | interneuron                     | Yes                                      | Yes                                      |int | Cell |
|20 | astrocyte                       | No                                       | Yes                                      |int | Cell |
|21 | glial                           | No                                       | Yes                                      |int | Cell |
|22 | oligodendrocyte                 | No                                       | Yes                                      |int | Cell |
|23 | microglia/opc                   | No                                       | Yes                                      |int | Cell |
|24 | c-shaped                        | No                                       | Yes                                      | int | Cell |
|25 | blood-vessel-cell               | No                                       | Yes                                      | int | Cell |
|26 | spiny-stellate                  | No                                       | Yes                                      |int | Cell |
|27 | excitatory/spiny-with-atypical-tree| Yes                                   | Yes                                      |int | Cell |
|28 | thin-apical-dendrite            | No                                       | Yes                                      |int | Cell |
|29 | bipolar                         | Yes                                      | Yes                                      | int | Cell |
|30 | inverted-apical-dendrite        | No                                       | Yes                                      |int | Cell |
|31 | unusually-thin-dendrites        | No                                       | Yes                                      |int | Cell |
|32 | sparsely-spiny                  | Yes                                      | Yes                                      |int | Cell |
|33 | lots-of-spines                  | No                                       | Yes                                      |int | Cell |
|34 | possible-interneuron            | No                                       | Yes                                      |int | Cell |
|35 | web-like-interneuron            | Yes                                      | Yes                                      |int | Cell |
|36 | lot-of-axon                     | Yes                                      | Yes                                      |int | Cell |
|37 | Dendrite                        | No                                      | Yes                                       |Boolean |  Dendrite|
|38 | Dendritic_shaft                 | No                                      | Yes                                      |Boolean |   Dendrite|
|39 | Dendritic_spine                  | No                                      | Yes                                      |Boolean |   Dendrite|
|40 | Presynaptic                     | No                                      | Yes                                      |Boolean | Synapse|
|41 | Postsynaptic                    | No                                      | Yes                                      |Boolean |  Synapse|
|42| Cleft                            | No                                      | Yes                                      |Boolean | Synapse|
|43 | neuron_id                   | No                                      | Yes                                      |long_int | Synapse|
|44 | id                          | No                                      | Yes                                      |long_int | Synapse |
|45 | type                        | No                                      | Yes                                      |int | Synapse |
|46 | class_label                 | No                                      | Yes                                      |str | Synapse |
|47 | base_neuron_id              | No                                      | Yes                                      |long_int | Synapse |
|48 | Ribosomes                       | No                                      | Yes                                      |Boolean | Organelle|
|49 | Endoplasmic_Reticulum           | No                                      | Yes                                      |Boolean | Organelle|
|50 | Mitochondria                     | No                                      | Yes                                      |Boolean | Organelle|
|51 | Golgi_Apparatus                 | No                                      | Yes                                      |Boolean | Organelle|
|52 | Spine_Apparatus                 | No                                      | Yes                                      |Boolean | Organelle|
|53 | SynapticVesicle                | No                                      | Yes                                      |Boolean | Organelle|
|54 | Axon_Initial_Segment             | No                                      | Yes                                      |int | Axon |
|55 | Axon_terminal                    | No                                      | Yes                                      |int | Axon |
|56 | Myelinated_axon                  | No                                      | Yes                                      |int | Axon |




Collecting the variety of data types can confirm what is represented and what needs to be changed. 






