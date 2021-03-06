require recipes-support/libmpc/libmpc_1.0.2.bb

# Using pkgconfig to check the existence of the library and set all 
# necessary flags.

inherit debian-package pkgconfig
DEBIAN_SECTION = "libs"
DPR = "0"
DPN = "mpclib"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=7fbc338309ac38fefcd64b04bb903e34"

DEBIAN_PATCH_TYPE = "quilt"

# Remove -Werror when initialize automake 
SRC_URI += "\
	file://fix-configure.patch \
"
