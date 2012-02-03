
This plugin gzips your static resources.

It then sets the Transfer-Encoding header on the resources when rendering them.

Builds on the "Resources" framework plugin 

Todos:

* Add "excludes" URIs via Config to prevent certain types and URIs being handled in this way - 
  e.g. by default should exclude all image and pre-zipped formats but also allow excluding whole URIs and types.
  Allow closure to determine it at runtime. e.g.:

  zipped.resources.excludes = [
  	  '*.gif',
  	  '*.jpg',
  	  '*.jpeg',
  	  '*.png',
	  '*.pdf',
	  '*.zip',
	  '*.gz',
	  '*.dmg',
	  { uri ->
	  	  return !uri.startsWith('user-content')
	  }
  ]

* Add a "minimum size" threshold under which it will not bother gzipping.
  Default to sane value circa 300bytes. Files smaller than this come out
  bigger as zips.

