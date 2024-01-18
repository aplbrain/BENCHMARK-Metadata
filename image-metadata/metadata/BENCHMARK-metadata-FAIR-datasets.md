# BENCHMARK Metadata for FAIR Datasets, v1.1
This document outlines a set of key metadata that should be defined in the BENCHMARK v1.1 standards to ensure datasets which are FAIR (Findable, Accesible, Interoperable, and Resusable). These recommendations are closely based on recommendations established in the BICCN and BICAN programs for FAIR dataset release, as well as recommended metadata for Standards for 3D Microscopy ([standards](https://doi.org/10.1038/s41597-022-01562-5))

# ***Checklist for FAIR Datasets using the BENCHMARK Standards***
Completing these fields are required to ensure minimal compliance with FAIR principles and to enable listing of these datasets on portals and repositories that aggregate datasets. Dataset publishers and archives should endeavour to make these key identifiers queryable through a programmatic interface. 

* Title of project (Project->Title): A descriptive, human readable project title to aid in search
* Description (Project->Description): A description of the dataset content and organization, in text form. 
* Contributor List (Project->Contributors): List of authors and dataset contributors for citations.
* Contact Person (Project->PointOfContact): Person to reach out to for additional information.
* Species (Project->Species): Species included in the project, to aid in search and aggregation
* Anatomical Region (Project->ImageLocations): Anatomical brain regions included in projects, to aid in searach and aggregation
* Modalities/techniques (Project->GeneralModalities,Project->ImagingModalities): Techniques and imaging modalities used, to aid in search and aggregation
* Funding Information (Project->Funding): Funding agency names and grant numbers
* License (Project->License): Licenses which govern release and reuse of project data
* Protocol (Project->Methods): Identifier to protocols.io or similar methodological reference
* Project identifier (Project->UniqueIdentifier): A unique identifier for the project issued by a host archive or portal, such as a DOI

Relevant fields are documented below. 

![fieldNames](https://img.shields.io/badge/BENCHMARK-fieldNames-FFFC33)

<br/><br/> 

## **Projects**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Title | Provides title for a specific project. | String | Yes |
| Description | Description gives a brief description of paper and dataset. | String | Yes |
| PointOfContact | Point of contact for this project, may be multiple people. | [Contributors] | Yes |
| Contributor | Persons who contributed to creation of this project. | [Contributor] | Yes |
| Species | Common organism classification name for the donor organism. | String | Yes |
| ImageLocations | Locations of experimental volumes within the brain. | [BrainLocation] | No |
| GeneralModality | Gives list of general techniques and approaches associated with this dataset. This may indicate additional modalities associated with the project, beyond microscopy data. | [GeneralModality] | Yes |
| ImagingModalities | Gives a list of modalities contained in this project. | [ImagingModalityGeneral] | Yes |
| Funding | Information about funding agencies. | [Funding] | No |
| License | One or more licenses associated with the use of this project. | [License] | Yes|
| Methods | Identifiers linking to description of methods (paper or protocols.io, for instance). | [String] | No |
| UniqueIdentifier | Unique identifier for dataset (DOI preferred) | Link | No |

<br/><br/> 

## **Contributors**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Name | Credit to person or organization who contributing to or is responsible for the project. | [String] | Yes |
| Email | Email can be used to connect a person or organization by email. | [String] | No |
| Creator | Identifies contributor who created a dataset. | Boolean | No |
| ContributorType | Categorization of the role of the contributor. Recommended: ProjectLeader (for principal investigator), ResearchGroup (for lab, department, or division) | Enum (ContactPerson, DataCollector, DataCurator, ProjectLeader, ProjectManager, ProjectMember, RelatedPerson, Researcher, ResearchGroup, Other). | No |
| NameType | Type of contributor. | Enum (Organizational, Personal) | No |
| NameIdentifier | Identifier of individual or entity that created contribution. | Enum (GRID, ISNI, ORCID, ROR, RRID | No |
| NameIdentifierScheme | Identifying scheme used in NameIdentifier. | Enum (GRID, ISNI, ORCID, ROR, RRID, Other) | No |
| Affiliation | Organization associated with individual contributor a particular project. | String | No |
| AffiliationIdentifier | Affiliation Identifiers are unique values assigned to affiliation. | String | No |
| AffiliationIdentifierScheme | Identifying scheme used in AffiliationIdentifier. | Enum (GRID, ISNI, ORCID, ROR, RRID, Other) | No |

<br/><br/> 

## **BrainLocation**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Name | Name of brain location or tissue location. | String | Yes |
| Location | X, Y, and Z extent of dataset in reference coordinate frame. | DataLocation | Yes |
| BrainRegionName | Code of brain region(s) in this location, drawn from a common atlas. | [String] | No |
| Orientation | Orientation of volume in common reference frame expressed in rotation matrices, euler angles, or quaternions. | [Float] | No |
| OrientationType | Type of orientation definition. | String | No |

<br/><br/> 

## **DataLocation**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Xs | Spatial extent of X dimension. | [Float] | Yes |
| Ys | Spatial extent of Y dimension. | [Float] | Yes |
| Zs | Spatial extent of Z dimension. | [Float] | Yes |
| Ts | Spatial extent of time dimension. | [Float] | Yes |
| Resolution | Image Resolution. | ImageResoluton | Yes |
| URI | Link to data. | String | No |

<br/><br/> 

## **License**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| Rights | License which defines usage of the data. | String | Yes |
| RightsURI | The right URI is a digital resource providing the license of a project. | String | Yes |

<br/><br/> 

## **Funding**

| Field Name       | Definition  | Allowed Values | Required |
| ---------------- | ----------- | -------------- | -------- |
| FundingEntity | The individual or organization who are providing financial support to a project. | String | Yes |
| AwardIdentifier | Award identifier provides an award or grant by an awarding organization. | String | Yes |
| FundingReferenceIdentifier | The funding reference identifier identifies the sources and references of a project. | String | No |
| FundingReferenceIdentifierType | Type of funding source identifier. | Enum (GRID, ISNI, ORCID, ROR, RRID, Other) | No |
| AwardTitle | The name of the award or grant from funding entity. | String | No |
