package android.emu6502.instructions

final class Opcodes {
  companion object {
    public val MAP: Map<Instruction, IntArray> = hashMapOf(
      /*              Name,             Imm,  ZP,   ZPX,  ZPY,  ABS, ABSX, ABSY,  IND, INDX, INDY, SNGL, BRA */
      Pair(Instruction.ADC, intArrayOf(0x69, 0x65, 0x75, 0xff, 0x6d, 0x7d, 0x79, 0xff, 0x61, 0x71, 0xff, 0xff)),
      Pair(Instruction.AND, intArrayOf(0x29, 0x25, 0x35, 0xff, 0x2d, 0x3d, 0x39, 0xff, 0x21, 0x31, 0xff, 0xff)),
      Pair(Instruction.ASL, intArrayOf(0xff, 0x06, 0x16, 0xff, 0x0e, 0x1e, 0xff, 0xff, 0xff, 0xff, 0x0a, 0xff)),
      Pair(Instruction.BIT, intArrayOf(0xff, 0x24, 0xff, 0xff, 0x2c, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.BPL, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x10)),
      Pair(Instruction.BMI, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x30)),
      Pair(Instruction.BVC, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x50)),
      Pair(Instruction.BVS, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x70)),
      Pair(Instruction.BCC, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x90)),
      Pair(Instruction.BCS, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xb0)),
      Pair(Instruction.BNE, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xd0)),
      Pair(Instruction.BEQ, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xf0)),
      Pair(Instruction.BRK, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x00, 0xff)),
      Pair(Instruction.CMP, intArrayOf(0xc9, 0xc5, 0xd5, 0xff, 0xcd, 0xdd, 0xd9, 0xff, 0xc1, 0xd1, 0xff, 0xff)),
      Pair(Instruction.CPX, intArrayOf(0xe0, 0xe4, 0xff, 0xff, 0xec, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.CPY, intArrayOf(0xc0, 0xc4, 0xff, 0xff, 0xcc, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.DEC, intArrayOf(0xff, 0xc6, 0xd6, 0xff, 0xce, 0xde, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.EOR, intArrayOf(0x49, 0x45, 0x55, 0xff, 0x4d, 0x5d, 0x59, 0xff, 0x41, 0x51, 0xff, 0xff)),
      Pair(Instruction.CLC, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x18, 0xff)),
      Pair(Instruction.SEC, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x38, 0xff)),
      Pair(Instruction.CLI, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x58, 0xff)),
      Pair(Instruction.SEI, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x78, 0xff)),
      Pair(Instruction.CLV, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xb8, 0xff)),
      Pair(Instruction.CLD, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xd8, 0xff)),
      Pair(Instruction.SED, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xf8, 0xff)),
      Pair(Instruction.INC, intArrayOf(0xff, 0xe6, 0xf6, 0xff, 0xee, 0xfe, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.JMP, intArrayOf(0xff, 0xff, 0xff, 0xff, 0x4c, 0xff, 0xff, 0x6c, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.JSR, intArrayOf(0xff, 0xff, 0xff, 0xff, 0x20, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.LDA, intArrayOf(0xa9, 0xa5, 0xb5, 0xff, 0xad, 0xbd, 0xb9, 0xff, 0xa1, 0xb1, 0xff, 0xff)),
      Pair(Instruction.LDX, intArrayOf(0xa2, 0xa6, 0xff, 0xb6, 0xae, 0xff, 0xbe, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.LDY, intArrayOf(0xa0, 0xa4, 0xb4, 0xff, 0xac, 0xbc, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.LSR, intArrayOf(0xff, 0x46, 0x56, 0xff, 0x4e, 0x5e, 0xff, 0xff, 0xff, 0xff, 0x4a, 0xff)),
      Pair(Instruction.NOP, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xea, 0xff)),
      Pair(Instruction.ORA, intArrayOf(0x09, 0x05, 0x15, 0xff, 0x0d, 0x1d, 0x19, 0xff, 0x01, 0x11, 0xff, 0xff)),
      Pair(Instruction.TAX, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xaa, 0xff)),
      Pair(Instruction.TXA, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x8a, 0xff)),
      Pair(Instruction.DEX, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xca, 0xff)),
      Pair(Instruction.INX, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xe8, 0xff)),
      Pair(Instruction.TAY, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xa8, 0xff)),
      Pair(Instruction.TYA, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x98, 0xff)),
      Pair(Instruction.DEY, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x88, 0xff)),
      Pair(Instruction.INY, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xc8, 0xff)),
      Pair(Instruction.ROR, intArrayOf(0xff, 0x66, 0x76, 0xff, 0x6e, 0x7e, 0xff, 0xff, 0xff, 0xff, 0x6a, 0xff)),
      Pair(Instruction.ROL, intArrayOf(0xff, 0x26, 0x36, 0xff, 0x2e, 0x3e, 0xff, 0xff, 0xff, 0xff, 0x2a, 0xff)),
      Pair(Instruction.RTI, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x40, 0xff)),
      Pair(Instruction.RTS, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x60, 0xff)),
      Pair(Instruction.SBC, intArrayOf(0xe9, 0xe5, 0xf5, 0xff, 0xed, 0xfd, 0xf9, 0xff, 0xe1, 0xf1, 0xff, 0xff)),
      Pair(Instruction.STA, intArrayOf(0xff, 0x85, 0x95, 0xff, 0x8d, 0x9d, 0x99, 0xff, 0x81, 0x91, 0xff, 0xff)),
      Pair(Instruction.TXS, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x9a, 0xff)),
      Pair(Instruction.TSX, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xba, 0xff)),
      Pair(Instruction.PHA, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x48, 0xff)),
      Pair(Instruction.PLA, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x68, 0xff)),
      Pair(Instruction.PHP, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x08, 0xff)),
      Pair(Instruction.PLP, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x28, 0xff)),
      Pair(Instruction.STX, intArrayOf(0xff, 0x86, 0xff, 0x96, 0x8e, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.STY, intArrayOf(0xff, 0x84, 0x94, 0xff, 0x8c, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff)),
      Pair(Instruction.XXX, intArrayOf(0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff))
    );
  }
}
