---
title: Required Field Names for Metadata
date: today
author: Contributors
---

# ***Required Field Names***

![fieldNames](https://img.shields.io/badge/BENCHMARK-fieldNames-FFFC33)

<br/><br/> 

## **Contributors**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Name | Credit to peopleperson or organization who contributeding to or is responsible for the a project | String |
| Email |  | String | 
| Creator | There is at least one mMain researchers involved in producing the data. There must be at least on creator | Boolean |
| contrbutorType | Categorization of the role of the contributor. Recommended: ProjectLeader (for principal investigator), ResearchGroup (for lab, department, or division) | ContactPerson, DataCollector, DataCurator, ProjectLeader, ProjectManager, ProjectMember, RelatedPerson, Researcher, ResearchGroup, Other  |
| nameType | Type of contributor |Organizational, Personal |
| nameIdentifier | A code used to identify individual or entity that created contribution | GRDI, ISNI, ORCID, ROR, RRID |
| nameIdentifierScheme | Identifying scheme used in nameIdentifier | GRDI, ISNI, ORCID, ROR, RRID, Other |
| POCName | Point of Contact name to reach | String |
| POCEmail | Point of contact gives the emails of those who contributed | String |
| Affiliation | Individual or entity in an organization associated with a particular project | String |
| affiliationIdentifier |  | GRID, ISNI, ORCID, ROR, RRID |
| affiliationIdentifierScheme |  | GRDI, ISNI, ORCID, ROR, RRID, Other |


<br/><br/> 

## **License**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Rights | Refers to the permission and limitations granted to a person or organization | String |
| rightURI | The right URI is a digital resource providing the license of a project | String | 
| rightsIdentifier | A code used to identify a particular licenser to a licensee | String |
| DOI | Digital Object Identifier identifiers that are assigned to a digital object | String |


<br/><br/> 

## **Funding**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| fundingEntity | The individual or organization who are providing financial support to a project | String |
| awardIdentifier | Award identifier provides an award or grant by an awarding organization | String | 
| fundingReferenceIdentifier | The funding reference identifier identifies the sources and references of a project | String |
| fundingReferenceIdentifierType |  | GRDI, ISNI, ORCID, ROR, RRID, Other |
| awardTitle | The recognition to the contributor(s) achievements | String |


<br/><br/> 

## **Specimen**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Species | Common organism classification name for the donor organism  | String |
| Age | Age of the organism | Integer | 
| Sex | Sex of organism | String |
| taxonomyCode | A set of names of organisms stored in the public sequence A ten-digit alphanumeric code that classifies each species by a uniquely | String |


<br/><br/> 

## **Coordinate Frame**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Xs | Numerical value represented horizontally in two-dimension | Integer |
| Ys | Numerical value represented vertically in two-dimension | Integer | 
| Zs | Numerical value representing height in three-deminsion | Integer |
| voxelSize | The dimension of 3D volume in 3D dataset | Image Resolution |

<br/><br/> 

## **Publication**

| Field Name       | Definition  | Allowed Values |
| ---------------- | ----------- | -------------- |
| Name | Credit to people or organization who contributed or is responsible for publication | String |
| URI | Uniform Resource Identifier is a of characters that identifies the web page | String | 
| Authors | The create or writer of a literary | String |
| RelatedIdentifier |  | String |
| RelateIdentifierType |  | arXiv, DOI, ISBN, PMID |
| PMCID | PubMed Central identifiers are identifiers assigned to publications | String | 
| relationType | Relation type refers to type of publication (e.g. paper, article, etc.) | IsCitedBy, IsDocumentedBy |
| Citation | Gives those who read material for other source of where material came from | String |
