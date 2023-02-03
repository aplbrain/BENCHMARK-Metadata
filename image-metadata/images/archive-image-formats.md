# Standards for Archive Image and Data Storage

The field of connectomics overlaps heavily with other neuroimaging domains but has particular aspects of data scale, proofreading workflows, and secondary data products which require custom approaches. We aim to leverage existing standards as much as possible, and aim to promote cross-archive and project compatibility. We recognize, however, that individual laboratories and software projects have significant investments in tools and formats and may need to maintain these approaches. However, adhering to the recommended standards on publication/export of the data products can greatly enhance interoperability and reuse in the community.

## General Desirable Properties of Image/Data Formats
* Find common, non-evolving formats
* Create wrappers around existing tools/ecosystems
* Consider versioning, making images immutable
* Consider linkages between imagery data and other data types
* Fundamental concepts of sharding should be followed
* Consider both the individual laboratory and the needs of a community user
* Versioned releases likely sufficient for most secondary analysis

## Suggested Image Formating Options
* [OME-Zarr (version 2)](https://github.com/ome/ome-zarr-py)
	* Support for sharding underway, anticipating
	* Tools and archives already supporting
	* Version 3 underway
	* Links like https://pythontic.com/hdf5/h5py/links are not yet supported but may be in an extension

* [Precomputed](https://github.com/google/neuroglancer/tree/master/src/neuroglancer/datasource/precomputed) 
	* Support in widely used Neuroglancer
	* Precompute supports mesh/annotation formats- no clear alternative yet
	* However, for imaging data, may be replaced by Zarr version 3

* [N5](https://github.com/saalfeldlab/n5) 
	* Sharding will be required
	* Overlaps with Zarr team

* [Tensorstore](https://google.github.io/tensorstore/)
	* Similar to sharding- smaller number of large files, provides a view of database with lots of small objects. Preserves random reads and writes. 
	* For EM volumentric data- not a clear advantage over sharded zarr. But for other formats maybe advantageous
	* Could be considered for meshes, skeletons and annotations
	* Advantages for working with large ML models

* Conversion 
	* If a tool/archive uses an internal format, one or more of the above should be supported for 

## Key Remaining Issues to Discuss
* Provenance- how to have immutable logs, track deltas, and version releases
* Label Mapping- Pychunkgraph or supervoxels, could these be aligned with zarr using a simple format for ID mappings
* Compression techniques- what codecs are permisible for segmentations and raw data. Zarr v3 codecs support blosc, gzip
* Lossless compression of segmentations, but should we allow for lossy compression of raw data?
* Other data products: 
	* Graphs- Neo4j, neuprint, serverless options (sql-lite like graph database), how to snapshot and version, and how to synch with connectome/graph changes?
* Point annotations
* Meshes- Multiresolution meshes or supervoxel meshes?