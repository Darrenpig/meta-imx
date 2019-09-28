DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI[arm-fb.md5sum] = "b52b2c60fe32acedf3e9a47e3a1f9d70"
SRC_URI[arm-fb.sha256sum] = "55dc08200656338a2271f8b17c5328beeb2b7e3d41e2a13fb160e62dc38bf71b"

SRC_URI[arm-wayland.md5sum] = "6013a12a49fcded76690e531c8020663"
SRC_URI[arm-wayland.sha256sum] = "f92e26d391fab968b5f3add2f4922cd01a930c6264fb25442abf4984b1ecf7ef"

SRC_URI[arm-x11.md5sum] = "8e42a47059046b1f3466344208e61bd3"
SRC_URI[arm-x11.sha256sum] = "76904cb20bc160507852ac54c94b947b9b2c1c99735ffc44f59b70175540b0cf"

SRC_URI[aarch64-fb.md5sum] = "66604794e40521a08c0f515f62b8b97a"
SRC_URI[aarch64-fb.sha256sum] = "ae147c283c19c3076e7182426d4de5b295bf911115f5c360df94ec322a8bca80"

SRC_URI[aarch64-wayland.md5sum] = "329ff66cf4efb5e698969a8927f39acb"
SRC_URI[aarch64-wayland.sha256sum] = "d31939625538e7221d046fa67bfed813535814c21c4446a075d07e8bc6ac262c"

SRC_URI[aarch64-x11.md5sum] = "f04966211c7c2d4f647d420510281b85"
SRC_URI[aarch64-x11.sha256sum] = "e1f0627e1413efc6dbd30479e35a9a4d405587054e7f769e4d429a9cc5caa7c3"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
