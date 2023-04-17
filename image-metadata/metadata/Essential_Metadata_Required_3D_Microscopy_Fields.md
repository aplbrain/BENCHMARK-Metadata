---
title: Required Field Names for Metadata
date: today
author: Contributors
---

# ***Required Field Names***

![fieldNames](https://img.shields.io/badge/BENCHMARK-fieldNames-FFFC33)

<br/><br/> 

## **Contributors**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Name | Credit to person or organization who contributing to or is responsible for the a project | [String] | Yes |
| Email | Email can be used to connect a person or organization by email | [String] | No |
| Creator | There is at least one mMain researchers involved in producing the data. There must be at least on creator | Boolean | Yes |
| contrbutorType | Categorization of the role of the contributor. Recommended: ProjectLeader (for principal investigator), ResearchGroup (for lab, department, or division) | Enum (ContactPerson, DataCollector, DataCurator, ProjectLeader, ProjectManager, ProjectMember, RelatedPerson, Researcher, ResearchGroup, Other) | No |
| nameType | Type of contributor | Enum (Organizational, Personal) | No |
| nameIdentifier | A code used to identify individual or entity that created contribution | Enum (GRID, ISNI, ORCID, ROR, RRID | No |
| nameIdentifierScheme | Identifying scheme used in nameIdentifier | Enum (GRID, ISNI, ORCID, ROR, RRID, Other) | No |
| POCName | Point of Contact name to reach | String | No |
| POCEmail | Point of contact gives the emails of those who contributed | String | No |
| Affiliation | Individual or entity in an organization associated with a particular project | String | No |
| affiliationIdentifier | Affiliation Identifiers are unique values assigned to the affiliation | Enum (GRID, ISNI, ORCID, ROR, RRID )| No |
| affiliationIdentifierScheme |  | Enum (GRID,, ISNI, ORCID, ROR, RRID, Other) | No |


<br/><br/> 

## **License**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Rights | Refers to the permission and limitations granted to a person or organization | String | Yes |
| rightURI | The right URI is a digital resource providing the license of a project | String | Yes |
| rightsIdentifier | A code used to identify a particular licenser to a licensee | String | Yes |


<br/><br/> 

## **Funding**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| fundingEntity | The individual or organization who are providing financial support to a project | String | Yes |
| awardIdentifier | Award identifier provides an award or grant by an awarding organization | String | Yes |
| fundingReferenceIdentifier | The funding reference identifier identifies the sources and references of a project | String | No |
| fundingReferenceIdentifierType |  | Enum (GRID, ISNI, ORCID, ROR, RRID, Other) | No |
| awardTitle | The recognition to the contributor(s) achievements | String | No |


<br/><br/> 

## **Projects**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Title | Title will give the title of publication | String | Yes |
| Description | Destription gives a brief description of paper and dataset | String | Yes |
| Species | Common organism classification name for the donor organism | String | Yes |
| dateCreated | Date create will indicate when the dataset was created | Date | Yes |

<br/><br/> 

## **Specimen**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Species | Common organism classification name for the donor organism | [String] | Yes |
| Age | Age of the organism | Integer | No |
| Sex | Sex of organism | String | No |
| taxonomyCode | A set of names of organisms stored in the public sequence A ten-digit alphanumeric code that classifies each species by a uniquely | String | No |


<br/><br/> 

## **Coordinate Frame**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Xs | Numerical value represented horizontally in two-dimension | Integer | Yes |
| Ys | Numerical value represented vertically in two-dimension | Integer | Yes |
| Zs | Numerical value representing height in three-deminsion | Integer | Yes |
| voxelSize | The dimension of 3D volume in 3D dataset | Image Resolution | Yes |

<br/><br/> 

## **Publication**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Name | CrarXivedit to people or organization who contributed or is responsible for publication | [String] | Yes |
| URI | Uniform Resource Identifier is a of characters that identifies the web page | [String] | Yes |
| Authors | The create or writer of a literary | [String] | Yes |
| RelatedIdentifier | Related Identifier gives the option to add information about related resources | String | No |
| RelateIdentifierType |  | Enum (arXiv, DOI, ISBN, PMID) | No |
| PMCID | PubMed Central identifiers are identifiers assigned to publications | String | No |
| relationType | Relation type refers to type of publication (e.g. paper, article, etc.) | Enum (IsCitedBy, IsDocumentedBy) | No |
| Citation | Gives those who read material for other source of where material came from | String | No |
