SUMMARY = "client subscribe sample"
AUTHOR = "Author's name <Author's e-mail>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
SRC_URI="file://git"
S="${WORKDIR}//git"

DEPENDS= "paho-mqtt-c paho-mqtt-cpp"

INSANE_SKIP_${PN} += "installed-vs-shipped"


WEBOS_VERSION = "0.0.1"
PR = "r0"
TARGET_CC_ARCH += "${LDFLAGS}"


inherit webos_component
inherit webos_submissions
inherit webos_cmake
